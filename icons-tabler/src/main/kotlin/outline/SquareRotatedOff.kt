package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareRotatedOff: ImageVector
    get() {
        if (_squareRotatedOff != null) return _squareRotatedOff!!
        _squareRotatedOff = tablerOutlineIcon(
            name = "SquareRotatedOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.964 16.952 L 13.502 20.413 C 12.720 21.196 11.280 21.196 10.502 20.413 L 3.591 13.503 C 2.808 12.720 2.808 11.280 3.591 10.503 L 7.046 7.047M 9.046 5.047 L 10.499 3.595 C 11.281 2.812 12.721 2.812 13.499 3.595 L 20.410 10.505 C 21.193 11.288 21.193 12.728 20.410 13.505 L 18.962 14.955"),
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
        return _squareRotatedOff!!
    }

private var _squareRotatedOff: ImageVector? = null
