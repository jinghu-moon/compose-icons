package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Engine: ImageVector
    get() {
        if (_engine != null) return _engine!!
        _engine = phosphorDuotoneIcon(
            name = "Engine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 120v48c0 4.418-3.582 8-8 8h-16l-37.66 37.66c-1.499 1.497-3.531 2.339-5.65 2.34h-77.38c-2.119-.001-4.151-.843-5.65-2.34L58.34 174.34C56.843 172.841 56.001 170.809 56 168.69v-88.69c0-4.418 3.582-8 8-8h116.69c2.119 .001 4.151 .843 5.65 2.34L224 112h16c4.418 0 8 3.582 8 8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M240 104h-12.69L192 68.69C189.01 65.676 184.936 63.986 180.69 64h-40.69v-24h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-64c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24v24h-60C55.163 64 48 71.163 48 80v52h-24v-24c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v64c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24h24v20.69c-.014 4.246 1.676 8.32 4.69 11.31L92 219.31c2.99 3.014 7.064 4.704 11.31 4.69h77.38c4.246 .014 8.32-1.676 11.31-4.69L227.31 184h12.69c8.837 0 16-7.163 16-16v-48c0-8.837-7.163-16-16-16ZM240 168h-16c-2.122-.002-4.158 .84-5.66 2.34L180.69 208h-77.38L64 168.69v-88.69h116.69l37.65 37.66c1.502 1.5 3.538 2.342 5.66 2.34h16Z"),
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
