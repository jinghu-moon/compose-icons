package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.JumpRope: ImageVector
    get() {
        if (_jumpRope != null) return _jumpRope!!
        _jumpRope = tablerOutlineIcon(
            name = "JumpRope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 14.000 L 6.000 8.000 C 6.000 6.343 7.343 5.000 9.000 5.000 C 10.657 5.000 12.000 6.343 12.000 8.000 L 12.000 16.000 C 12.000 17.657 13.343 19.000 15.000 19.000 C 16.657 19.000 18.000 17.657 18.000 16.000 L 18.000 10.000"),
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
                pathData = parseSvgPathData("M 16.000 5.000 C 16.000 3.895 16.895 3.000 18.000 3.000 C 19.105 3.000 20.000 3.895 20.000 5.000 L 20.000 8.000 C 20.000 9.105 19.105 10.000 18.000 10.000 C 16.895 10.000 16.000 9.105 16.000 8.000 L 16.000 5.000"),
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
                pathData = parseSvgPathData("M 4.000 16.000 C 4.000 14.895 4.895 14.000 6.000 14.000 C 7.105 14.000 8.000 14.895 8.000 16.000 L 8.000 19.000 C 8.000 20.105 7.105 21.000 6.000 21.000 C 4.895 21.000 4.000 20.105 4.000 19.000 L 4.000 16.000"),
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
        return _jumpRope!!
    }

private var _jumpRope: ImageVector? = null
