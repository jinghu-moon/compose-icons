package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cow: ImageVector
    get() {
        if (_cow != null) return _cow!!
        _cow = phosphorBoldIcon(
            name = "Cow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 128c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM152 112c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16ZM247.48 124.66c-3.798 4.645-9.48 7.339-15.48 7.34h-28v35.05c13.455 9.584 19.176 26.763 14.154 42.501C213.133 225.289 198.519 235.979 182 236h-108C57.481 235.979 42.867 225.289 37.846 209.551 32.824 193.813 38.545 176.634 52 167.05v-35.05h-28c-5.972-.006-11.629-2.68-15.423-7.292C4.782 120.097 3.246 114.031 4.39 108.17 9.574 82.681 30.554 63.412 56.39 60.41 48.357 49.972 44.001 37.171 44 24 44 17.373 49.373 12 56 12c6.627 0 12 5.373 12 12 0 19.882 16.118 36 36 36h48c19.882 0 36-16.118 36-36 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 .011 13.166-4.331 25.967-12.35 36.41 25.836 3.002 46.816 22.271 52 47.76 1.165 5.844-.367 11.902-4.17 16.49ZM76 160h104v-56C180 92.954 171.046 84 160 84h-64C84.954 84 76 92.954 76 104ZM56.5 84.64C43.923 87.052 33.562 95.938 29.26 108h22.74v-4c-.007-6.713 1.533-13.338 4.5-19.36ZM196 198c0-7.732-6.268-14-14-14h-108c-7.732 0-14 6.268-14 14 0 7.732 6.268 14 14 14h108c7.732 0 14-6.268 14-14ZM226.74 108C222.438 95.938 212.077 87.052 199.5 84.64c2.967 6.022 4.507 12.647 4.5 19.36v4Z"),
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
        return _cow!!
    }

private var _cow: ImageVector? = null
