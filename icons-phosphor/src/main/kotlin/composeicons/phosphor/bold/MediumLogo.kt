package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MediumLogo: ImageVector
    get() {
        if (_mediumLogo != null) return _mediumLogo!!
        _mediumLogo = phosphorBoldIcon(
            name = "MediumLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M68 60C30.445 60 0 90.445 0 128c0 37.555 30.445 68 68 68 37.555 0 68-30.445 68-68C135.961 90.461 105.539 60.039 68 60ZM68 172C43.699 172 24 152.301 24 128 24 103.699 43.699 84 68 84c24.301 0 44 19.699 44 44-.028 24.289-19.711 43.972-44 44ZM184 60c-23.63 0-36 34.21-36 68 0 33.79 12.37 68 36 68 23.63 0 36-34.21 36-68C220 94.21 207.63 60 184 60ZM184 171.87C180.26 169.71 172 154.78 172 128c0-26.78 8.26-41.71 12-43.87 3.74 2.16 12 17.09 12 43.87 0 26.78-8.26 41.71-12 43.87ZM256 72v112c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-112c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _mediumLogo!!
    }

private var _mediumLogo: ImageVector? = null
