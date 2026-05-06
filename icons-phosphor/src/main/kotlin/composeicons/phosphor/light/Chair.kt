package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Chair: ImageVector
    get() {
        if (_chair != null) return _chair!!
        _chair = phosphorLightIcon(
            name = "Chair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 138h-34v-36h18c7.732 0 14-6.268 14-14v-48c0-7.732-6.268-14-14-14h-128C56.268 26 50 32.268 50 40v48c0 7.732 6.268 14 14 14h18v36h-34c-7.732 0-14 6.268-14 14v16c0 7.732 6.268 14 14 14h10v42c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-42h116v42c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-42h10c7.732 0 14-6.268 14-14v-16c0-7.732-6.268-14-14-14ZM62 88v-48c0-1.105 .895-2 2-2h128c1.105 0 2 .895 2 2v48c0 1.105-.895 2-2 2h-128c-1.105 0-2-.895-2-2ZM94 102h68v36h-68ZM210 168c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-16c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2Z"),
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
