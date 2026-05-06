package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Command: ImageVector
    get() {
        if (_command != null) return _command!!
        _command = phosphorThinIcon(
            name = "Command",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 148h-24v-40h24c17.673 0 32-14.327 32-32C212 58.327 197.673 44 180 44c-17.673 0-32 14.327-32 32v24h-40v-24C108 58.327 93.673 44 76 44 58.327 44 44 58.327 44 76c0 17.673 14.327 32 32 32h24v40h-24c-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32v-24h40v24c0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32 0-17.673-14.327-32-32-32ZM156 76c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24h-24ZM52 76C52 62.745 62.745 52 76 52c13.255 0 24 10.745 24 24v24h-24C62.745 100 52 89.255 52 76ZM100 180c0 13.255-10.745 24-24 24C62.745 204 52 193.255 52 180c0-13.255 10.745-24 24-24h24ZM108 108h40v40h-40ZM180 204c-13.255 0-24-10.745-24-24v-24h24c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
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
        return _command!!
    }

private var _command: ImageVector? = null
