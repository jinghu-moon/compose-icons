package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WebhooksLogo: ImageVector
    get() {
        if (_webhooksLogo != null) return _webhooksLogo!!
        _webhooksLogo = phosphorThinIcon(
            name = "WebhooksLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180.7 172h-72.89c-1.69 18.582-14.916 34.078-33.002 38.665C56.723 215.252 37.71 207.934 27.368 192.403 17.026 176.873 17.604 156.509 28.81 141.59c1.328-1.767 3.838-2.123 5.605-.795 1.767 1.328 2.123 3.838 .795 5.605C30.511 152.619 27.979 160.206 28 168c0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36 0-2.209 1.791-4 4-4h76.7c1.948-5.51 7.583-8.815 13.343-7.827 5.76 .988 9.971 5.983 9.971 11.827 0 5.844-4.211 10.839-9.971 11.827-5.76 .988-11.395-2.317-13.343-7.827ZM64 180c4.622-.002 8.832-2.658 10.824-6.829 1.992-4.171 1.411-9.115-1.494-12.711l37.11-60.3c.558-.904 .734-1.993 .488-3.027-.246-1.034-.893-1.927-1.798-2.483C95.934 86.519 89.424 70.856 92.969 55.767 96.514 40.678 109.318 29.553 124.754 28.149c15.436-1.404 30.037 7.23 36.246 21.431 .533 1.366 1.77 2.33 3.224 2.515 1.454 .184 2.893-.442 3.749-1.632 .856-1.19 .993-2.753 .357-4.073C160.938 29.482 143.781 18.984 125.362 20.096 106.943 21.209 91.174 33.696 85.871 51.37c-5.303 17.674 .985 36.78 15.749 47.85L66.52 156.27c-.828-.182-1.673-.272-2.52-.27-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM192 124c-6.786-.002-13.48 1.565-19.56 4.58l-35.11-57c3.542-4.347 3.601-10.569 .142-14.982-3.459-4.414-9.514-5.843-14.582-3.442-5.068 2.401-7.797 7.992-6.573 13.464 1.224 5.473 6.076 9.368 11.683 9.38 .847-.003 1.692-.093 2.52-.27L167.63 136c1.158 1.88 3.619 2.466 5.5 1.31 12.996-7.969 29.602-6.888 41.455 2.698 11.853 9.586 16.384 25.598 11.311 39.974C220.822 194.357 207.244 203.978 192 204c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 24.301 0 44-19.699 44-44 0-24.301-19.699-44-44-44Z"),
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
