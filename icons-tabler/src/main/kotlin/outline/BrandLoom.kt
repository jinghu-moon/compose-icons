package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandLoom: ImageVector
    get() {
        if (_brandLoom != null) return _brandLoom!!
        _brandLoom = tablerOutlineIcon(
            name = "BrandLoom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.464 6.518 C 16.095 3.507 12.548 2.172 9.533 3.532 C 6.519 4.893 5.174 8.437 6.527 11.455 C 7.879 14.473 11.419 15.828 14.441 14.483"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 17.482 17.464 C 20.493 16.095 21.828 12.548 20.468 9.533 C 19.107 6.519 15.563 5.174 12.545 6.527 C 9.527 7.879 8.172 11.419 9.517 14.441"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 6.540 17.482 C 7.909 20.493 11.456 21.829 14.470 20.468 C 17.485 19.108 18.830 15.564 17.478 12.546 C 16.126 9.528 12.586 8.173 9.564 9.517"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 6.518 6.540 C 3.507 7.909 2.171 11.456 3.532 14.470 C 4.892 17.485 8.436 18.830 11.454 17.478 C 14.472 16.126 15.827 12.586 14.483 9.564"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _brandLoom!!
    }

private var _brandLoom: ImageVector? = null
