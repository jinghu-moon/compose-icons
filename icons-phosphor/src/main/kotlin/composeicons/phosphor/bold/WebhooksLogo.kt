package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WebhooksLogo: ImageVector
    get() {
        if (_webhooksLogo != null) return _webhooksLogo!!
        _webhooksLogo = phosphorBoldIcon(
            name = "WebhooksLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 180h-73.29c-4.682 21.193-21.187 37.772-42.359 42.548C55.179 227.323 33.155 219.436 19.828 202.305 6.502 185.175 4.274 161.887 14.11 142.54c1.921-3.869 5.774-6.407 10.088-6.645 4.314-.238 8.422 1.862 10.757 5.497 2.335 3.635 2.535 8.244 .525 12.068C33.175 157.959 31.982 162.945 32 168c0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32 0-6.627 5.373-12 12-12h84c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM192 112c-6.282-.004-12.519 1.051-18.45 3.12L138.22 57.71c-3.474-5.644-10.866-7.404-16.51-3.93-5.644 3.474-7.404 10.866-3.93 16.51l40.94 66.52c1.668 2.713 4.347 4.652 7.445 5.389 3.099 .737 6.363 .212 9.075-1.459 11.248-6.912 25.587-6.206 36.102 1.777 10.515 7.983 15.049 21.604 11.415 34.296-3.634 12.692-14.69 21.85-27.837 23.057-6.385 .585-11.182 6.085-10.894 12.491 .289 6.405 5.562 11.452 11.974 11.459 .363 .02 .727 .02 1.09 0 30.095-2.393 52.876-28.212 51.503-58.37C247.22 135.291 222.188 111.649 192 112ZM57.71 178.22c2.71 1.668 5.973 2.192 9.069 1.455 3.096-.737 5.773-2.674 7.441-5.385l40.94-66.52c3.476-5.642 1.721-13.033-3.92-16.51C99.708 84.158 93.896 70.566 96.728 57.322 99.559 44.079 110.421 34.052 123.849 32.286c13.427-1.766 26.512 5.113 32.671 17.174 1.921 3.869 5.774 6.407 10.088 6.645 4.314 .238 8.422-1.862 10.757-5.497 2.335-3.635 2.535-8.244 .525-12.068C167.756 18.78 146.902 6.875 124.734 8.194 102.566 9.513 83.272 23.807 75.553 44.63c-7.719 20.823-2.404 44.24 13.547 59.69L53.78 161.71c-1.668 2.71-2.192 5.973-1.455 9.069 .737 3.096 2.674 5.773 5.385 7.441Z"),
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
        return _webhooksLogo!!
    }

private var _webhooksLogo: ImageVector? = null
