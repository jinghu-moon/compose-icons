package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VideoPlus: ImageVector
    get() {
        if (_videoPlus != null) return _videoPlus!!
        _videoPlus = tablerOutlineIcon(
            name = "VideoPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 10.000 L 19.553 7.724 C 19.863 7.569 20.231 7.586 20.526 7.768 C 20.820 7.950 21.000 8.272 21.000 8.618 L 21.000 15.382 C 21.000 15.728 20.820 16.050 20.526 16.232 C 20.231 16.414 19.863 16.431 19.553 16.276 L 15.000 14.000 L 15.000 10.000"),
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
                pathData = parseSvgPathData("M 3.000 8.000 C 3.000 6.895 3.895 6.000 5.000 6.000 L 13.000 6.000 C 14.105 6.000 15.000 6.895 15.000 8.000 L 15.000 16.000 C 15.000 17.105 14.105 18.000 13.000 18.000 L 5.000 18.000 C 3.895 18.000 3.000 17.105 3.000 16.000 L 3.000 8.000"),
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
                pathData = parseSvgPathData("M 7.000 12.000 L 11.000 12.000"),
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
                pathData = parseSvgPathData("M 9.000 10.000 L 9.000 14.000"),
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
        return _videoPlus!!
    }

private var _videoPlus: ImageVector? = null
