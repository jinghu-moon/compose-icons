package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Engine: ImageVector
    get() {
        if (_engine != null) return _engine!!
        _engine = phosphorFillIcon(
            name = "Engine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M256 120v48c0 8.837-7.163 16-16 16h-12.69L192 219.31c-2.99 3.014-7.064 4.704-11.31 4.69h-77.38c-4.246 .014-8.32-1.676-11.31-4.69L52.69 180C49.676 177.01 47.986 172.936 48 168.69v-20.69h-24v24c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-64c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v24h24v-52C48 71.163 55.163 64 64 64h60v-24h-24c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-24v24h40.69c4.246-.014 8.32 1.676 11.31 4.69L227.31 104h12.69c8.837 0 16 7.163 16 16Z"),
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
        return _engine!!
    }

private var _engine: ImageVector? = null
