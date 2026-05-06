package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MagnetStraight: ImageVector
    get() {
        if (_magnetStraight != null) return _magnetStraight!!
        _magnetStraight = phosphorBoldIcon(
            name = "MagnetStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 36h-40c-11.046 0-20 8.954-20 20v88c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-88C116 44.954 107.046 36 96 36h-40C44.954 36 36 44.954 36 56v88c0 50.81 41.19 92 92 92h.71c50.34-.38 91.3-42.1 91.3-93v-87c0-5.306-2.109-10.395-5.861-14.146C210.396 38.103 205.306 35.997 200 36ZM196 60v24h-32v-24ZM92 60v24h-32v-24ZM128.52 212h-.52C90.445 212 60 181.555 60 144v-36h32v36c0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36v-36h32v35c0 37.77-30.27 68.72-67.48 69Z"),
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
        return _magnetStraight!!
    }

private var _magnetStraight: ImageVector? = null
