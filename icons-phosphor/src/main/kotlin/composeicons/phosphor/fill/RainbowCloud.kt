package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.RainbowCloud: ImageVector
    get() {
        if (_rainbowCloud != null) return _rainbowCloud!!
        _rainbowCloud = phosphorFillIcon(
            name = "RainbowCloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 160c-.028 26.498-21.502 47.972-48 48h-48c-17.65 0-32-14.75-32-32.89 0-18.14 14.35-32.89 32-32.89 1.116-0 2.231 .06 3.34 .18 8.451-21.454 30.963-33.868 53.617-29.565 22.654 4.303 39.047 24.106 39.043 47.165ZM112 72c22.922-.046 44.948 8.897 61.35 24.91 3.184 2.966 8.156 2.843 11.189-.278 3.033-3.12 3.016-8.093-.039-11.192C154.533 56.302 110.033 47.936 71.53 64.201 33.026 80.466 8.001 118.202 8 160v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16c.055-48.578 39.422-87.945 88-88ZM112 104c11.92-.033 23.535 3.768 33.13 10.84 2.275 1.959 5.456 2.479 8.236 1.347 2.781-1.132 4.694-3.726 4.954-6.717 .26-2.991-1.176-5.876-3.72-7.471C132.729 85.949 103.693 83.554 79.487 95.804 55.282 108.055 40.017 132.871 40 160v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16c.033-30.914 25.086-55.967 56-56ZM127.21 130.71c.49-2.065 .139-4.239-.975-6.045-1.114-1.806-2.9-3.095-4.965-3.585-11.908-2.837-24.459-.065-34.065 7.523C77.6 136.191 71.997 147.759 72 160v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16c-.002-7.346 3.361-14.288 9.126-18.841 5.765-4.553 13.298-6.214 20.444-4.509 2.066 .493 4.243 .143 6.052-.971 1.808-1.114 3.099-2.902 3.588-4.969Z"),
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
        return _rainbowCloud!!
    }

private var _rainbowCloud: ImageVector? = null
