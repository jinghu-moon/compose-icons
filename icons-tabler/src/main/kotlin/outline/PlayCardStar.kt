package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlayCardStar: ImageVector
    get() {
        if (_playCardStar != null) return _playCardStar!!
        _playCardStar = tablerOutlineIcon(
            name = "PlayCardStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 5.000 L 19.000 19.000 C 19.000 20.105 18.105 21.000 17.000 21.000 L 7.000 21.000 C 5.895 21.000 5.000 20.105 5.000 19.000 L 5.000 5.000 C 5.000 3.895 5.895 3.000 7.000 3.000 L 17.000 3.000 C 18.105 3.000 19.000 3.895 19.000 5.000"),
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
                pathData = parseSvgPathData("M 8.000 6.000 L 8.010 6.000"),
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
                pathData = parseSvgPathData("M 16.000 18.000 L 16.010 18.000"),
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
                pathData = parseSvgPathData("M 11.750 14.112 L 10.120 14.965 C 10.022 15.016 9.903 15.007 9.813 14.942 C 9.724 14.877 9.678 14.767 9.695 14.658 L 10.005 12.850 L 8.688 11.570 C 8.608 11.492 8.579 11.376 8.614 11.270 C 8.648 11.163 8.740 11.086 8.851 11.071 L 10.671 10.807 L 11.486 9.163 C 11.536 9.063 11.638 8.999 11.750 8.999 C 11.861 8.999 11.963 9.063 12.013 9.163 L 12.827 10.807 L 14.647 11.071 C 14.758 11.086 14.850 11.163 14.885 11.269 C 14.920 11.375 14.891 11.492 14.811 11.570 L 13.493 12.850 L 13.803 14.657 C 13.822 14.767 13.777 14.878 13.687 14.944 C 13.596 15.009 13.477 15.018 13.378 14.965 L 11.750 14.112"),
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
        return _playCardStar!!
    }

private var _playCardStar: ImageVector? = null
