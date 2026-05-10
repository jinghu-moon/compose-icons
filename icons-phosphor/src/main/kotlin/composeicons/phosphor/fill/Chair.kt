package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Chair: ImageVector
    get() {
        if (_chair != null) return _chair!!
        _chair = phosphorFillIcon(
            name = "Chair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 136h-32v-32h16c8.837 0 16-7.163 16-16v-48c0-8.837-7.163-16-16-16h-128C55.163 24 48 31.163 48 40v48c0 8.837 7.163 16 16 16h16v32h-32c-8.837 0-16 7.163-16 16v16c0 8.837 7.163 16 16 16h8v40c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-40h112v40c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-40h8c8.837 0 16-7.163 16-16v-16c0-8.837-7.163-16-16-16ZM160 136h-64v-32h64Z"),
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
        return _chair!!
    }

private var _chair: ImageVector? = null
