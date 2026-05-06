package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandSoap: ImageVector
    get() {
        if (_handSoap != null) return _handSoap!!
        _handSoap = phosphorBoldIcon(
            name = "HandSoap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 97.68v-5.68C188 72.118 171.882 56 152 56h-12v-20h28c2.209 0 4 1.791 4 4 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12C196 24.536 183.464 12 168 12h-64C97.373 12 92 17.373 92 24c0 6.627 5.373 12 12 12h12v20h-12C84.118 56 68 72.118 68 92v5.68C49.083 103.063 36.026 120.332 36 140v76c0 11.046 8.954 20 20 20h144c11.046 0 20-8.954 20-20v-76c-.026-19.668-13.083-36.937-32-42.32ZM104 80h48c6.627 0 12 5.373 12 12v4h-72v-4c0-6.627 5.373-12 12-12ZM196 212h-136v-72c0-11.046 8.954-20 20-20h96c11.046 0 20 8.954 20 20Z"),
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
        return _handSoap!!
    }

private var _handSoap: ImageVector? = null
