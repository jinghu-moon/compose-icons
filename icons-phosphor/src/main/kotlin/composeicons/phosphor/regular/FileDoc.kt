package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FileDoc: ImageVector
    get() {
        if (_fileDoc != null) return _fileDoc!!
        _fileDoc = phosphorRegularIcon(
            name = "FileDoc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52 144h-16c-4.418 0-8 3.582-8 8v56c0 4.418 3.582 8 8 8h16c19.882 0 36-16.118 36-36C88 160.118 71.882 144 52 144ZM52 200h-8v-40h8c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM221.53 195.09c3.192 3.054 3.304 8.118 .25 11.31-5.63 6.06-13.508 9.533-21.78 9.6-17.65 0-32-16.15-32-36 0-19.85 14.35-36 32-36 8.272 .067 16.15 3.54 21.78 9.6 2.985 3.202 2.842 8.209-.321 11.236-3.163 3.027-8.172 2.948-11.239-.176C207.596 161.772 203.901 160.087 200 160c-8.82 0-16 9-16 20 0 11 7.18 20 16 20 3.901-.087 7.596-1.772 10.22-4.66 3.054-3.192 8.118-3.304 11.31-.25ZM128 144c-17.65 0-32 16.15-32 36 0 19.85 14.35 36 32 36 17.65 0 32-16.15 32-36 0-19.85-14.35-36-32-36ZM128 200c-8.82 0-16-9-16-20 0-11 7.18-20 16-20 8.82 0 16 9 16 20 0 11-7.18 20-16 20ZM48 120c4.418 0 8-3.582 8-8v-72h88v48c0 4.418 3.582 8 8 8h48v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24c.002-2.122-.84-4.158-2.34-5.66l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v72c0 4.418 3.582 8 8 8ZM160 51.31 188.69 80h-28.69Z"),
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
        return _fileDoc!!
    }

private var _fileDoc: ImageVector? = null
