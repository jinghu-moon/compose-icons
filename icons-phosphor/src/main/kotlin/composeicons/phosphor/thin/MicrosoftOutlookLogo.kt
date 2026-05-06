package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MicrosoftOutlookLogo: ImageVector
    get() {
        if (_microsoftOutlookLogo != null) return _microsoftOutlookLogo!!
        _microsoftOutlookLogo = phosphorThinIcon(
            name = "MicrosoftOutlookLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M116 128c0-15.464-12.536-28-28-28-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28ZM68 128c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C76.954 148 68 139.046 68 128ZM224 108h-20v-68c0-2.209-1.791-4-4-4h-96c-2.209 0-4 1.791-4 4v28h-60C33.373 68 28 73.373 28 80v96c0 6.627 5.373 12 12 12h36v20c0 6.627 5.373 12 12 12h128c6.627 0 12-5.373 12-12v-96c0-2.209-1.791-4-4-4ZM220 208.17 158.83 164 220 119.82v88.18c.005 .057 .005 .113 0 .17ZM211.63 116 204 121.51v-5.51ZM108 44h88v83.29l-44 31.78-4-2.89v-76.18c0-6.627-5.373-12-12-12h-28ZM36 176v-96c0-2.209 1.791-4 4-4h96c2.209 0 4 1.791 4 4v96c0 2.209-1.791 4-4 4h-96c-2.209 0-4-1.791-4-4ZM84 208v-20h52c6.627 0 12-5.373 12-12v-9.95L211.63 212h-123.63c-2.209 0-4-1.791-4-4Z"),
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
