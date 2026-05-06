package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FileC: ImageVector
    get() {
        if (_fileC != null) return _fileC!!
        _fileC = phosphorRegularIcon(
            name = "FileC",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M48 180c0 11 7.18 20 16 20 3.901-.087 7.596-1.772 10.22-4.66 3.067-3.124 8.076-3.202 11.239-.176 3.163 3.027 3.306 8.034 .321 11.236C80.15 212.46 72.272 215.933 64 216 46.35 216 32 199.85 32 180c0-19.85 14.35-36 32-36 8.272 .067 16.15 3.54 21.78 9.6 2.985 3.202 2.842 8.209-.321 11.236-3.163 3.027-8.172 2.948-11.239-.176C71.596 161.772 67.901 160.087 64 160c-8.82 0-16 9-16 20ZM216 88v128c0 8.837-7.163 16-16 16h-80c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h80v-120h-48c-4.418 0-8-3.582-8-8v-48h-88v72c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-72C40 31.163 47.163 24 56 24h96c2.122-.002 4.158 .84 5.66 2.34l56 56c1.5 1.502 2.342 3.538 2.34 5.66ZM160 80h28.69L160 51.31Z"),
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
        return _fileC!!
    }

private var _fileC: ImageVector? = null
