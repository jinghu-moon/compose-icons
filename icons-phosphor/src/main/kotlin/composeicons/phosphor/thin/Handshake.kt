package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Handshake: ImageVector
    get() {
        if (_handshake != null) return _handshake!!
        _handshake = phosphorThinIcon(
            name = "Handshake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M250.73 109.69 225.2 58.69c-1.423-2.847-3.918-5.013-6.938-6.02-3.019-1.007-6.315-.773-9.162 .65L182.88 66.38 129 52.14c-.655-.173-1.345-.173-2 0L73.12 66.38 46.9 53.27c-2.847-1.423-6.143-1.657-9.162-.65-3.019 1.007-5.515 3.173-6.938 6.02L5.27 109.69c-1.423 2.847-1.657 6.143-.65 9.162 1.007 3.019 3.173 5.515 6.02 6.938l27.29 13.65 55.75 39.82c.406 .292 .864 .502 1.35 .62l64 16c1.354 .355 2.796-.025 3.8-1l55.54-55.54 27-13.5c2.847-1.423 5.013-3.918 6.02-6.938 1.007-3.019 .773-6.315-.65-9.162ZM199.73 146.64 162.53 116.84c-1.595-1.28-3.898-1.15-5.34 .3-19.49 19.64-41.34 17.11-55.29 8.2-1.04-.667-1.721-1.771-1.85-3-.138-1.183 .27-2.365 1.11-3.21L145.62 76h35.91l29.6 59.21ZM12.21 116.32c-.32-.991-.241-2.067 .22-3L38 62.22h0c.669-1.347 2.037-2.204 3.54-2.22 .619 .004 1.228 .151 1.78 .43l24 12L38.21 130.64l-24-12c-.948-.477-1.668-1.312-2-2.32ZM158.77 187.57 97.71 172.3 45.11 134.73 75.45 74 128 60.14 157.72 68h-13.72c-1.042-.001-2.043 .404-2.79 1.13L95.51 113.46c-2.576 2.576-3.842 6.183-3.442 9.805 .401 3.621 2.425 6.864 5.502 8.815 19.88 12.71 44.13 10 62.66-6.81L194 152.33ZM243.77 116.32c-.332 1.008-1.052 1.843-2 2.32l-24 12L188.68 72.43l24-12c1.965-.957 4.333-.16 5.32 1.79l25.53 51.05c.488 .942 .581 2.039 .26 3.05ZM127.94 217c-.457 1.769-2.053 3.003-3.88 3-.337 .001-.673-.039-1-.12L81.38 209.45c-.488-.119-.95-.33-1.36-.62L53.68 190c-1.798-1.284-2.214-3.782-.93-5.58 1.284-1.798 3.782-2.214 5.58-.93l25.72 18.37 41 10.25c1.034 .261 1.921 .925 2.464 1.843 .543 .918 .696 2.015 .426 3.047Z"),
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
        return _handshake!!
    }

private var _handshake: ImageVector? = null
