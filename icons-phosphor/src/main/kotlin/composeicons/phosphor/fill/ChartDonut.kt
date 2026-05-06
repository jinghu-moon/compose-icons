package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChartDonut: ImageVector
    get() {
        if (_chartDonut != null) return _chartDonut!!
        _chartDonut = phosphorFillIcon(
            name = "ChartDonut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 161.94v65.34c.008 1.146-.476 2.239-1.329 3.004-.853 .765-1.993 1.127-3.131 .996-37.646-4.624-69.814-29.323-84-64.5-.421-1.062-.368-2.254 .146-3.274 .514-1.02 1.44-1.772 2.544-2.066L97.32 144.5c1.656-.435 3.405 .233 4.35 1.66 3.82 5.526 9.27 9.721 15.59 12 1.63 .541 2.733 2.062 2.74 3.78ZM128.06 24c-2.132-.016-4.182 .82-5.696 2.322C120.851 27.824 120 29.868 120 32v56c-.033 4.381 3.489 7.962 7.87 8 15.6-.067 28.975 11.124 31.66 26.492 2.685 15.367-6.102 30.431-20.8 35.658-1.63 .546-2.729 2.071-2.73 3.79v65.34c-.007 1.144 .475 2.236 1.326 3 .851 .765 1.988 1.128 3.124 1 54.714-6.471 94.887-54.489 91.6-109.486C228.762 66.798 183.155 23.907 128.06 24ZM96.06 125.49c.372-4.725 1.79-9.309 4.15-13.42v-.07c1.621-2.8 1.396-6.301-.57-8.87-.673-.864-1.508-1.588-2.46-2.13L48.85 73.06c-1.839-1.06-4.024-1.346-6.074-.795-2.05 .551-3.797 1.895-4.856 3.735C26.281 96.158 21.732 119.634 25 142.68c.156 1.138 .794 2.154 1.75 2.789 .957 .635 2.14 .829 3.25 .531L93.22 129c1.605-.444 2.758-1.849 2.88-3.51Z"),
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
        return _chartDonut!!
    }

private var _chartDonut: ImageVector? = null
