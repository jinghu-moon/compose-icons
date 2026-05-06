package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TumblrLogo: ImageVector
    get() {
        if (_tumblrLogo != null) return _tumblrLogo!!
        _tumblrLogo = phosphorBoldIcon(
            name = "TumblrLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 124c6.627 0 12-5.373 12-12v-40c0-6.627-5.373-12-12-12h-36v-36c0-6.627-5.373-12-12-12h-32c-6.627 0-12 5.373-12 12C100 43.882 83.882 60 64 60 57.373 60 52 65.373 52 72v40c0 6.627 5.373 12 12 12h20v52c.039 37.539 30.461 67.961 68 68h40c6.627 0 12-5.373 12-12v-48c0-6.627-5.373-12-12-12h-32c-2.209 0-4-1.791-4-4v-44ZM160 196h20v24h-28c-24.289-.028-43.972-19.711-44-44v-64c0-6.627-5.373-12-12-12h-20v-17.21C99.541 77.937 117.937 59.541 122.79 36h9.21v36c0 6.627 5.373 12 12 12h36v16h-36c-6.627 0-12 5.373-12 12v56c0 15.464 12.536 28 28 28Z"),
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
        return _tumblrLogo!!
    }

private var _tumblrLogo: ImageVector? = null
