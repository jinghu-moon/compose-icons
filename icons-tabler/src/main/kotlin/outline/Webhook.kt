package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Webhook: ImageVector
    get() {
        if (_webhook != null) return _webhook!!
        _webhook = tablerOutlineIcon(
            name = "Webhook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.876 13.610 C 3.247 14.631 2.574 16.667 3.275 18.458 C 3.976 20.248 5.852 21.287 7.742 20.930 C 9.631 20.574 11.000 18.923 11.000 17.000 L 17.000 17.000"),
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
                pathData = parseSvgPathData("M 15.066 20.502 C 16.530 21.310 18.342 21.122 19.609 20.031 C 20.876 18.940 21.331 17.176 20.749 15.609 C 20.167 14.041 18.672 13.000 17.000 13.000 C 16.294 13.000 15.576 13.179 15.000 13.500 L 12.000 8.000"),
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
                pathData = parseSvgPathData("M 16.000 8.000 C 16.000 5.791 14.209 4.000 12.000 4.000 C 9.791 4.000 8.000 5.791 8.000 8.000 C 8.000 9.506 8.770 10.818 10.000 11.500 L 7.000 17.000"),
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
        return _webhook!!
    }

private var _webhook: ImageVector? = null
