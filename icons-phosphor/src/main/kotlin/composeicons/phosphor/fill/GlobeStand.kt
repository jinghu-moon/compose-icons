package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GlobeStand: ImageVector
    get() {
        if (_globeStand != null) return _globeStand!!
        _globeStand = phosphorFillIcon(
            name = "GlobeStand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56 104C56 59.817 91.817 24 136 24c44.183 0 80 35.817 80 80 0 44.183-35.817 80-80 80C91.838 183.95 56.05 148.162 56 104ZM202.46 173.28c-37.684 36.278-97.475 35.71-134.463-1.277C31.01 135.015 30.442 75.224 66.72 37.54c2.032-2.052 2.801-5.039 2.011-7.817-.79-2.778-3.015-4.914-5.822-5.59-2.808-.676-5.762 .214-7.729 2.328C25.117 57.797 15.878 103.688 31.473 144.217c15.595 40.529 53.212 68.39 96.527 71.493v16.29h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h64c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-24v-16.28c26.092-1.802 50.715-12.743 69.54-30.9 2.114-1.967 3.004-4.921 2.328-7.729-.676-2.808-2.813-5.033-5.59-5.822-2.778-.79-5.765-.021-7.817 2.011Z"),
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
        return _globeStand!!
    }

private var _globeStand: ImageVector? = null
