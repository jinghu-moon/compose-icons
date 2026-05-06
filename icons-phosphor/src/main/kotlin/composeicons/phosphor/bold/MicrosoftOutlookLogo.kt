package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MicrosoftOutlookLogo: ImageVector
    get() {
        if (_microsoftOutlookLogo != null) return _microsoftOutlookLogo!!
        _microsoftOutlookLogo = phosphorBoldIcon(
            name = "MicrosoftOutlookLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M124 128C124 108.118 107.882 92 88 92 68.118 92 52 108.118 52 128c0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36ZM76 128c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM224 100h-12v-68c0-6.627-5.373-12-12-12h-96C97.373 20 92 25.373 92 32v24h-56C24.954 56 16 64.954 16 76v104c0 11.046 8.954 20 20 20h32v16c0 11.046 8.954 20 20 20h128c11.046 0 20-8.954 20-20v-104c0-6.627-5.373-12-12-12ZM171.55 168 212 136.54v62.92ZM116 44h72v80.8l-28 21.78v-70.58C160 64.954 151.046 56 140 56h-24ZM40 80h96v96h-96ZM92 200h48c7.915-.006 15.082-4.679 18.28-11.92L189 212h-97Z"),
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
        return _microsoftOutlookLogo!!
    }

private var _microsoftOutlookLogo: ImageVector? = null
