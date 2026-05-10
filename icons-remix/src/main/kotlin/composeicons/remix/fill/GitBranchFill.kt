package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GitBranchFill: ImageVector
    get() {
        if (_gitBranchFill != null) return _gitBranchFill!!
        _gitBranchFill = remixIcon(
            name = "GitBranchFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.105 15.21C8.215 15.65 9 16.733 9 18c0 1.657-1.343 3-3 3C4.343 21 3 19.657 3 18c0-1.306 .835-2.417 2-2.829v-6.341C3.835 8.417 3 7.306 3 6 3 4.343 4.343 3 6 3 7.657 3 9 4.343 9 6 9 7.306 8.165 8.417 7 8.829v3.17C7.836 11.372 8.874 11 10 11h4c1.384 0 2.548-.936 2.895-2.21C15.785 8.35 15 7.267 15 6 15 4.343 16.343 3 18 3c1.657 0 3 1.343 3 3 0 1.333-.87 2.463-2.073 2.854C18.522 11.208 16.47 13 14 13h-4c-1.383 0-2.548 .936-2.895 2.21Z"),
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
        return _gitBranchFill!!
    }

private var _gitBranchFill: ImageVector? = null
