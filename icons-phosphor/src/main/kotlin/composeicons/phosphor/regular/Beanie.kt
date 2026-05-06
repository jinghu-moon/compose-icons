package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Beanie: ImageVector
    get() {
        if (_beanie != null) return _beanie!!
        _beanie = phosphorRegularIcon(
            name = "Beanie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 162.16v-18.16C223.919 100.13 194.161 61.874 151.66 51c7.42-11.725 5.134-27.115-5.373-36.177-10.507-9.062-26.067-9.062-36.574 0C99.206 23.885 96.92 39.275 104.34 51 61.839 61.874 32.081 100.13 32 144v18.16c-4.945 2.855-7.994 8.13-8 13.84v32c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-32c-.006-5.71-3.055-10.985-8-13.84ZM116 36c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM128 64c44.162 .05 79.95 35.838 80 80v16h-160v-16C48.05 99.838 83.838 64.05 128 64ZM120 176v32h-40v-32ZM136 176h40v32h-40ZM40 176h24v32h-24ZM216 208h-24v-32h24v32Z"),
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
        return _beanie!!
    }

private var _beanie: ImageVector? = null
