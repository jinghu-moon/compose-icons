package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sticker: ImageVector
    get() {
        if (_sticker != null) return _sticker!!
        _sticker = phosphorBoldIcon(
            name = "Sticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 28h-80C54.879 28.039 28.039 54.879 28 88v80c.039 33.121 26.879 59.961 60 60h48c1.289-0 2.569-.21 3.79-.62 27.63-9.21 78.38-60 87.59-87.59 .41-1.221 .62-2.501 .62-3.79v-48C227.961 54.879 201.121 28.039 168 28ZM52 168v-80C52 68.118 68.118 52 88 52h80c19.882 0 36 16.118 36 36v36h-20c-33.121 .039-59.961 26.879-60 60v20h-36C68.118 204 52 187.882 52 168ZM148 195.63v-11.63c0-19.882 16.118-36 36-36h11.63C184 164.11 164.11 184 148 195.63Z"),
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
        return _sticker!!
    }

private var _sticker: ImageVector? = null
