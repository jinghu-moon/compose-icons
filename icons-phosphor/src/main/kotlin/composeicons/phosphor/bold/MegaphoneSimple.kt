package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MegaphoneSimple: ImageVector
    get() {
        if (_megaphoneSimple != null) return _megaphoneSimple!!
        _megaphoneSimple = phosphorBoldIcon(
            name = "MegaphoneSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.7 82.84 53.76 28.84l-.16-.05C47.555 27.027 41.033 28.214 35.996 31.993 30.959 35.772 27.997 41.703 28 48v144c-0 11.022 8.918 19.967 19.94 20 1.915-.003 3.821-.275 5.66-.81h.16l78.24-24v8.81c0 11.046 8.954 20 20 20h32c11.046 0 20-8.954 20-20v-30.94l25.7-7.89C238.163 154.619 243.967 146.839 244 138v-36c-.037-8.835-5.84-16.611-14.3-19.16ZM52 186.58v-133.15L132 78v84ZM180 192h-24v-12.22l24-7.36ZM220 135.05l-64 19.63v-69.35L220 105Z"),
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
        return _megaphoneSimple!!
    }

private var _megaphoneSimple: ImageVector? = null
