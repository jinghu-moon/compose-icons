package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BubbleX: ImageVector
    get() {
        if (_bubbleX != null) return _bubbleX!!
        _bubbleX = tablerOutlineIcon(
            name = "BubbleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.500 18.750 C 13.155 18.840 12.773 19.000 12.400 19.000 C 11.863 19.000 11.330 18.899 10.830 18.702 L 7.000 21.000 L 7.000 17.866 C 6.207 17.683 5.541 17.148 5.192 16.413 C 4.842 15.678 4.847 14.824 5.205 14.093 C 3.237 12.961 2.332 10.605 3.034 8.447 C 3.737 6.288 5.856 4.917 8.113 5.160 C 9.251 3.623 11.123 2.813 13.022 3.035 C 14.921 3.258 16.556 4.480 17.307 6.238 C 18.860 6.425 20.253 7.285 21.116 8.590 C 21.979 9.895 22.226 11.513 21.791 13.016"),
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
                pathData = parseSvgPathData("M 22.000 22.000 L 17.000 17.000"),
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
                pathData = parseSvgPathData("M 17.000 22.000 L 22.000 17.000"),
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
        return _bubbleX!!
    }

private var _bubbleX: ImageVector? = null
