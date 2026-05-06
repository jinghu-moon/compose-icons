package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AndroidLogo: ImageVector
    get() {
        if (_androidLogo != null) return _androidLogo!!
        _androidLogo = phosphorDuotoneIcon(
            name = "AndroidLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 160v24c0 4.418-3.582 8-8 8h-192c-4.418 0-8-3.582-8-8v-22.87C24 103.65 70.15 56.2 127.63 56c27.647-.098 54.195 10.815 73.778 30.33C220.992 105.844 232 132.353 232 160Z"),
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
                pathData = parseSvgPathData("M176 148c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM92 136c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM240 160v24c0 8.837-7.163 16-16 16h-192c-8.837 0-16-7.163-16-16v-22.87C15.971 129.962 28.774 100.157 51.4 78.72L26.34 53.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L63.82 68.5c38.49-27.271 89.984-27.343 128.55-.18l26-26c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L204.82 78.5c.75 .71 1.5 1.43 2.24 2.17C228.217 101.637 240.083 130.213 240 160ZM224 160C224 106.981 181.019 64 128 64h-.34C74.91 64.18 32 107.75 32 161.13v22.87h192Z"),
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
        return _androidLogo!!
    }

private var _androidLogo: ImageVector? = null
