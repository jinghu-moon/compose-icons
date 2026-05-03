package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandLivewire: ImageVector
    get() {
        if (_brandLivewire != null) return _brandLivewire!!
        _brandLivewire = tablerOutlineIcon(
            name = "BrandLivewire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.982 18.777 C 20.610 19.325 20.330 20.000 19.576 20.000 C 18.307 20.000 18.239 18.087 16.969 18.087 C 15.699 18.087 15.769 20.000 14.499 20.000 C 13.231 20.000 13.162 18.087 11.892 18.087 C 10.623 18.087 10.692 20.000 9.422 20.000 C 8.154 20.000 8.085 18.087 6.815 18.087 C 5.545 18.087 5.615 20.000 4.345 20.000 C 3.947 20.000 3.666 19.811 3.430 19.552 C 2.490 17.948 1.996 16.121 2.000 14.262 C 2.000 8.593 6.477 4.000 12.000 4.000 C 17.524 4.000 22.000 8.594 22.000 14.261 C 22.000 15.881 21.634 17.413 20.982 18.777"),
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
                pathData = parseSvgPathData("M 20.982 18.777 C 20.610 19.325 20.330 20.000 19.576 20.000 C 18.307 20.000 18.239 18.087 16.969 18.087 C 15.699 18.087 15.769 20.000 14.499 20.000 C 13.231 20.000 13.162 18.087 11.892 18.087 C 10.623 18.087 10.692 20.000 9.422 20.000 C 8.154 20.000 8.085 18.087 6.815 18.087 C 5.545 18.087 5.615 20.000 4.345 20.000 C 3.947 20.000 3.666 19.811 3.430 19.552 C 2.490 17.948 1.996 16.121 2.000 14.262 C 2.000 8.593 6.477 4.000 12.000 4.000 C 17.524 4.000 22.000 8.594 22.000 14.261 C 22.000 15.881 21.634 17.413 20.982 18.777"),
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
                pathData = parseSvgPathData("M 11.500 16.000 C 14.667 16.000 16.000 14.252 16.000 11.769 C 16.000 9.285 13.986 7.000 11.500 7.000 C 9.015 7.000 7.000 9.286 7.000 11.769 C 7.000 14.252 8.333 16.000 11.500 16.000"),
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
                pathData = parseSvgPathData("M 10.000 11.000 C 10.552 11.000 11.000 10.552 11.000 10.000 C 11.000 9.448 10.552 9.000 10.000 9.000 C 9.448 9.000 9.000 9.448 9.000 10.000 C 9.000 10.552 9.448 11.000 10.000 11.000"),
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
        return _brandLivewire!!
    }

private var _brandLivewire: ImageVector? = null
