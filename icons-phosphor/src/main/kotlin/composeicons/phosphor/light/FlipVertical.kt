package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) return _flipVertical!!
        _flipVertical = phosphorLightIcon(
            name = "FlipVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56 118h160c6.666 .01 12.415-4.682 13.741-11.215 1.326-6.533-2.138-13.095-8.281-15.685h-.11L61.4 27.1C57.081 25.294 52.146 25.767 48.248 28.359 44.35 30.951 42.006 35.319 42 40v64c0 7.732 6.268 14 14 14ZM54 40c0-1.105 .895-2 2-2 .271-.001 .54 .054 .79 .16l.11 .05 159.92 64c.82 .407 1.259 1.319 1.065 2.214-.194 .895-.97 1.544-1.885 1.576h-160c-1.105 0-2-.895-2-2ZM216 138h-160c-7.732 0-14 6.268-14 14v64c0 4.682 2.341 9.054 6.237 11.65 3.896 2.596 8.832 3.073 13.153 1.27l160-64 .11-.05c6.11-2.616 9.538-9.166 8.205-15.677C228.373 142.682 222.646 138.005 216 138ZM216.82 153.83l-159.92 64-.11 .05c-.625 .269-1.344 .202-1.908-.179-.564-.38-.896-1.021-.882-1.701v-64c0-1.105 .895-2 2-2h160c.948-.006 1.77 .654 1.969 1.581 .199 .927-.281 1.866-1.149 2.249Z"),
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
        return _flipVertical!!
    }

private var _flipVertical: ImageVector? = null
