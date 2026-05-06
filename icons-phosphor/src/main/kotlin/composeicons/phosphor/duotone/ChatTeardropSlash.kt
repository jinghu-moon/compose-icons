package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChatTeardropSlash: ImageVector
    get() {
        if (_chatTeardropSlash != null) return _chatTeardropSlash!!
        _chatTeardropSlash = phosphorDuotoneIcon(
            name = "ChatTeardropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 124h0c0 50.81-41.19 92-92 92h-84c-4.418 0-8-3.582-8-8v-84C40 73.19 81.19 32 132 32h0c50.81 0 92 41.19 92 92Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L55.26 59.88C40.186 77.84 31.947 100.552 32 124v84c0 8.837 7.163 16 16 16h84c20.177-.026 39.878-6.135 56.53-17.53l13.55 14.91c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM132 208h-84v-84C47.958 105.061 54.358 86.67 66.15 71.85L177.66 194.51C164.084 203.369 148.211 208.059 132 208ZM232 124c.013 18.203-4.949 36.063-14.35 51.65-2.286 3.783-7.207 4.996-10.99 2.71-3.783-2.286-4.996-7.207-2.71-10.99 19.191-31.799 15.221-72.425-9.763-99.907C169.204 39.981 129.138 32.168 95.66 48.25c-3.982 1.916-8.764 .242-10.68-3.74-1.916-3.982-.242-8.764 3.74-10.68 30.99-14.878 67.449-12.796 96.543 5.514C214.357 57.654 232.007 89.624 232 124Z"),
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
        return _chatTeardropSlash!!
    }

private var _chatTeardropSlash: ImageVector? = null
