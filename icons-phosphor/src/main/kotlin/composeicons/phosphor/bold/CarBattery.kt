package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CarBattery: ImageVector
    get() {
        if (_carBattery != null) return _carBattery!!
        _carBattery = phosphorBoldIcon(
            name = "CarBattery",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 140c0 6.627-5.373 12-12 12h-4v4c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-4h-4c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h4v-4c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v4h4c6.627 0 12 5.373 12 12ZM100 128h-32c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h32c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM244 92v92c0 11.046-8.954 20-20 20h-192C20.954 204 12 195.046 12 184v-92C12 80.954 20.954 72 32 72h12v-16C44 44.954 52.954 36 64 36h32c11.046 0 20 8.954 20 20v16h24v-16c0-11.046 8.954-20 20-20h32c11.046 0 20 8.954 20 20v16h12c11.046 0 20 8.954 20 20ZM164 72h24v-12h-24ZM68 72h24v-12h-24ZM220 96h-184v84h184Z"),
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
        return _carBattery!!
    }

private var _carBattery: ImageVector? = null
