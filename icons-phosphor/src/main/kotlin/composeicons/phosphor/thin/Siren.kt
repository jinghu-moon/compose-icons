package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Siren: ImageVector
    get() {
        if (_siren != null) return _siren!!
        _siren = phosphorThinIcon(
            name = "Siren",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M124 16v-8c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v8c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4ZM200 44c1.061 .001 2.079-.42 2.83-1.17l8-8c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0l-8 8c-1.145 1.144-1.488 2.866-.868 4.361 .62 1.496 2.08 2.47 3.698 2.469ZM53.17 42.83c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66l-8-8c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66ZM136.66 76.05c-2.182-.365-4.245 1.108-4.61 3.29-.365 2.182 1.108 4.245 3.29 4.61C156.24 87.45 172 106.39 172 128c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C180 102.53 161.37 80.2 136.66 76.05ZM228 176v24c0 6.627-5.373 12-12 12h-176c-6.627 0-12-5.373-12-12v-24c0-6.627 5.373-12 12-12h4v-36C44 81.608 81.608 44 128 44h.64c46 .34 83.36 38.47 83.36 85v35h4c6.627 0 12 5.373 12 12ZM52 164h152v-35C204 86.85 170.17 52.31 128.58 52 108.323 51.845 88.843 59.784 74.465 74.054 60.086 88.323 51.999 107.743 52 128ZM220 176c0-2.209-1.791-4-4-4h-176c-2.209 0-4 1.791-4 4v24c0 2.209 1.791 4 4 4h176c2.209 0 4-1.791 4-4Z"),
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
        return _siren!!
    }

private var _siren: ImageVector? = null
