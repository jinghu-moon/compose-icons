package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HeadCircuit: ImageVector
    get() {
        if (_headCircuit != null) return _headCircuit!!
        _headCircuit = phosphorFillIcon(
            name = "HeadCircuit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 72c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM144 136c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8ZM192.5 171.47C213.004 154.251 224.59 128.659 224 101.89q0-1.1-.09-2.19c-.132-2.111-1.885-3.754-4-3.75h-24.16l-23.13 27.75c5.965 10.053 3.82 22.941-5.08 30.52-8.9 7.579-21.965 7.643-30.939 .152-8.974-7.49-11.246-20.357-5.381-30.468 5.866-10.111 18.163-14.526 29.12-10.454L185.85 82.83C187.38 81.023 189.632 79.987 192 80h23.14c1.302 .002 2.524-.631 3.274-1.696 .75-1.065 .935-2.428 .496-3.654C207.27 42 176.86 18 140.74 16.08h-.59c-1.087-.041-2.143 .363-2.926 1.117-.783 .755-1.225 1.795-1.224 2.883v29.25c11.02 3.896 17.631 15.165 15.654 26.686C149.678 87.536 139.689 95.957 128 95.957c-11.689 0-21.678-8.421-23.654-19.942C102.369 64.495 108.98 53.226 120 49.33v-27c.003-1.219-.55-2.373-1.502-3.134-.952-.761-2.199-1.047-3.388-.776C76.427 27.92 48.92 62.178 48 102L25.55 145.14l-.22 .45c-3.398 7.799-.098 16.894 7.51 20.7l.25 .12L56 176.9v31c0 8.837 7.163 16 16 16h40v8c0 4.418 3.582 8 8 8h71.77c1.416 .013 2.812-.331 4.06-1 2.881-1.571 4.511-4.743 4.11-8Z"),
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
        return _headCircuit!!
    }

private var _headCircuit: ImageVector? = null
