package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BehanceLogo: ImageVector
    get() {
        if (_behanceLogo != null) return _behanceLogo!!
        _behanceLogo = phosphorFillIcon(
            name = "BehanceLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 120h-28v-24h28c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM96 136h-32v32h32c8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16ZM176 120c-10.168 .003-19.231 6.413-22.62 16h45.24C195.231 126.413 186.168 120.003 176 120ZM240 56v144c0 8.837-7.163 16-16 16h-192c-8.837 0-16-7.163-16-16v-144C16 47.163 23.163 40 32 40h192c8.837 0 16 7.163 16 16ZM144 88c0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-48c-4.418 0-8 3.582-8 8ZM128 152c-.005-10.643-5.301-20.587-14.13-26.53 6.711-8.406 8.014-19.913 3.352-29.606C112.559 86.17 102.756 80.004 92 80h-36c-4.418 0-8 3.582-8 8v88c0 4.418 3.582 8 8 8h40c17.673 0 32-14.327 32-32ZM216 144c-.001-18.848-13.159-35.138-31.585-39.103-18.426-3.965-37.12 5.471-44.873 22.65-7.754 17.179-2.463 37.44 12.7 48.635 15.163 11.195 36.084 10.286 50.218-2.182 3.314-2.924 3.629-7.981 .705-11.295-2.924-3.314-7.981-3.629-11.295-.705-5.98 5.269-14.186 7.225-21.9 5.221C162.255 165.217 156.039 159.514 153.38 152h54.62c4.418 0 8-3.582 8-8Z"),
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
        return _behanceLogo!!
    }

private var _behanceLogo: ImageVector? = null
