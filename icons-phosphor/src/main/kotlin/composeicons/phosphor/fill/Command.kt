package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Command: ImageVector
    get() {
        if (_command != null) return _command!!
        _command = phosphorFillIcon(
            name = "Command",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M116 116h24v24h-24ZM86 72C78.268 72 72 78.268 72 86c0 7.732 6.268 14 14 14h14v-14C100 78.268 93.732 72 86 72ZM184 86c0-7.732-6.268-14-14-14-7.732 0-14 6.268-14 14v14h14c7.732 0 14-6.268 14-14ZM72 170c0 7.732 6.268 14 14 14 7.732 0 14-6.268 14-14v-14h-14c-7.732 0-14 6.268-14 14ZM224 48v160c0 8.837-7.163 16-16 16h-160c-8.837 0-16-7.163-16-16v-160C32 39.163 39.163 32 48 32h160c8.837 0 16 7.163 16 16ZM156 140v-24h14c16.569 0 30-13.431 30-30C200 69.431 186.569 56 170 56c-16.569 0-30 13.431-30 30v14h-24v-14C116 69.431 102.569 56 86 56 69.431 56 56 69.431 56 86c0 16.569 13.431 30 30 30h14v24h-14c-16.569 0-30 13.431-30 30 0 16.569 13.431 30 30 30 16.569 0 30-13.431 30-30v-14h24v14c0 16.569 13.431 30 30 30 16.569 0 30-13.431 30-30 0-16.569-13.431-30-30-30ZM156 170c0 7.732 6.268 14 14 14 7.732 0 14-6.268 14-14 0-7.732-6.268-14-14-14h-14Z"),
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
