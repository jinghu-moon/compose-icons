package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MicrosoftWordLogo: ImageVector
    get() {
        if (_microsoftWordLogo != null) return _microsoftWordLogo!!
        _microsoftWordLogo = phosphorThinIcon(
            name = "MicrosoftWordLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 28h-128C65.373 28 60 33.373 60 40v28h-20C33.373 68 28 73.373 28 80v96c0 6.627 5.373 12 12 12h20v28c0 6.627 5.373 12 12 12h128c6.627 0 12-5.373 12-12v-176c0-6.627-5.373-12-12-12ZM156 100h48v56h-48ZM68 40c0-2.209 1.791-4 4-4h128c2.209 0 4 1.791 4 4v52h-48v-12c0-6.627-5.373-12-12-12h-76ZM36 176v-96c0-2.209 1.791-4 4-4h104c2.209 0 4 1.791 4 4v96c0 2.209-1.791 4-4 4h-104c-2.209 0-4-1.791-4-4ZM200 220h-128c-2.209 0-4-1.791-4-4v-28h76c6.627 0 12-5.373 12-12v-12h48v52c0 2.209-1.791 4-4 4ZM72.12 153 60.12 105c-.552-2.143 .737-4.328 2.88-4.88 2.143-.552 4.328 .737 4.88 2.88l9.38 37.51L88.42 118.18c.677-1.358 2.063-2.216 3.58-2.216 1.517 0 2.903 .858 3.58 2.216l11.16 22.33L116.12 103c.566-2.108 2.716-3.373 4.834-2.844 2.117 .529 3.419 2.658 2.926 4.784l-12 48c-.408 1.62-1.779 2.817-3.44 3h-.44c-1.516 .001-2.902-.855-3.58-2.21L92 128.94 79.58 153.79c-.748 1.498-2.351 2.372-4.016 2.189-1.665-.183-3.039-1.384-3.444-3.009Z"),
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
        return _microsoftWordLogo!!
    }

private var _microsoftWordLogo: ImageVector? = null
