package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZeppelinOff: ImageVector
    get() {
        if (_zeppelinOff != null) return _zeppelinOff!!
        _zeppelinOff = tablerOutlineIcon(
            name = "ZeppelinOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.773 15.783 C 15.050 15.924 14.287 16.000 13.500 16.000 C 11.370 16.000 8.916 15.074 6.136 13.223 L 4.000 15.000 L 4.000 11.670 C 3.318 11.132 2.651 10.575 2.000 10.000 C 2.651 9.425 3.318 8.868 4.000 8.330 L 4.000 5.000 L 6.135 6.778 C 6.265 6.691 6.396 6.606 6.525 6.522M 9.089 5.102 C 10.690 4.367 12.160 4.000 13.500 4.000 C 18.194 4.000 22.000 6.686 22.000 10.000 C 22.000 11.919 20.724 13.627 18.739 14.725"),
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
                pathData = parseSvgPathData("M 10.000 15.500 L 10.000 20.000 L 16.000 20.000 L 16.000 16.000"),
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
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _zeppelinOff!!
    }

private var _zeppelinOff: ImageVector? = null
