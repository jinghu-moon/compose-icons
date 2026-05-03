package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CloudCancel: ImageVector
    get() {
        if (_cloudCancel != null) return _cloudCancel!!
        _cloudCancel = tablerOutlineIcon(
            name = "CloudCancel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 18.004 L 6.657 18.004 C 4.085 18.000 2.000 15.993 2.000 13.517 C 2.000 11.042 4.085 9.035 6.657 9.035 C 7.050 7.273 8.451 5.835 10.332 5.262 C 12.212 4.690 14.288 5.069 15.776 6.262 C 17.264 7.452 17.938 9.269 17.546 11.031 L 18.536 11.031 C 19.619 11.031 20.640 11.539 21.292 12.404"),
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
                pathData = parseSvgPathData("M 16.000 19.000 C 16.000 20.657 17.343 22.000 19.000 22.000 C 20.657 22.000 22.000 20.657 22.000 19.000 C 22.000 17.343 20.657 16.000 19.000 16.000 C 17.343 16.000 16.000 17.343 16.000 19.000"),
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
                pathData = parseSvgPathData("M 17.000 21.000 L 21.000 17.000"),
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
        return _cloudCancel!!
    }

private var _cloudCancel: ImageVector? = null
