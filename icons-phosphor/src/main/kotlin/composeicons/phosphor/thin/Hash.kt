package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Hash: ImageVector
    get() {
        if (_hash != null) return _hash!!
        _hash = phosphorThinIcon(
            name = "Hash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 92h-53.39l9.33-51.28c.398-2.176-1.044-4.262-3.22-4.66-2.176-.398-4.262 1.044-4.66 3.22L162.48 92h-55.87l9.33-51.28c.398-2.176-1.044-4.262-3.22-4.66-2.176-.398-4.262 1.044-4.66 3.22L98.48 92h-50.48c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h49L86.84 156h-54.84c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h53.39l-9.33 51.28c-.395 2.173 1.047 4.255 3.22 4.65 .237 .047 .478 .071 .72 .07 1.937 .002 3.596-1.384 3.94-3.29L93.52 164h55.87l-9.33 51.28c-.395 2.173 1.047 4.255 3.22 4.65 .237 .047 .478 .071 .72 .07 1.937 .002 3.596-1.384 3.94-3.29L157.52 164h50.48c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-49l10.19-56h54.81c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM150.84 156h-55.84l10.19-56h55.81Z"),
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
        return _hash!!
    }

private var _hash: ImageVector? = null
