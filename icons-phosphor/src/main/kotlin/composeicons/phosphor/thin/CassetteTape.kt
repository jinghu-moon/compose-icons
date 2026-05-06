package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CassetteTape: ImageVector
    get() {
        if (_cassetteTape != null) return _cassetteTape!!
        _cassetteTape = phosphorThinIcon(
            name = "CassetteTape",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 52h-192C25.373 52 20 57.373 20 64v128c0 6.627 5.373 12 12 12h192c6.627 0 12-5.373 12-12v-128c0-6.627-5.373-12-12-12ZM72 196 90 172h76l18 24ZM228 192c0 2.209-1.791 4-4 4h-30L171.2 165.6C170.445 164.593 169.259 164 168 164h-80c-1.259 0-2.445 .593-3.2 1.6L62 196h-30c-2.209 0-4-1.791-4-4v-128c0-2.209 1.791-4 4-4h192c2.209 0 4 1.791 4 4ZM176 84h-96C64.536 84 52 96.536 52 112c0 15.464 12.536 28 28 28h96c15.464 0 28-12.536 28-28C204 96.536 191.464 84 176 84ZM60 112C60 100.954 68.954 92 80 92c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C68.954 132 60 123.046 60 112ZM99.57 132c5.39-5.258 8.43-12.47 8.43-20 0-7.53-3.04-14.742-8.43-20h56.86c-5.39 5.258-8.43 12.47-8.43 20 0 7.53 3.04 14.742 8.43 20ZM176 132c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
        return _cassetteTape!!
    }

private var _cassetteTape: ImageVector? = null
