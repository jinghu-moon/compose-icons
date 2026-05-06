package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LineSegment: ImageVector
    get() {
        if (_lineSegment != null) return _lineSegment!!
        _lineSegment = phosphorRegularIcon(
            name = "LineSegment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214.64 41.36C203.249 29.937 185.136 28.779 172.383 38.658c-12.753 9.88-16.158 27.707-7.943 41.592L80.25 164.44c-12.577-7.394-28.561-5.364-38.89 4.94h0c-11.755 11.761-12.543 30.565-1.813 43.269 10.729 12.704 29.4 15.073 42.962 5.452 13.562-9.621 17.496-28.026 9.051-42.351L175.75 91.56c13.884 8.215 31.712 4.81 41.592-7.943 9.88-12.753 8.722-30.866-2.702-42.257ZM75.31 203.36c-6.252 6.252-16.388 6.252-22.64 0-6.252-6.252-6.252-16.388-0-22.64h0c3.001-3.001 7.071-4.688 11.315-4.688 4.244 0 8.314 1.686 11.315 4.688h0c6.24 6.244 6.244 16.361 .01 22.61ZM203.31 75.36c-6.249 6.247-16.379 6.247-22.627-.002-6.248-6.248-6.248-16.378 0-22.627 6.248-6.248 16.378-6.249 22.627-.002 6.216 6.236 6.225 16.323 .02 22.57Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _lineSegment!!
    }

private var _lineSegment: ImageVector? = null
