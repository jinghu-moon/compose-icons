package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bug: ImageVector
    get() {
        if (_bug != null) return _bug!!
        _bug = phosphorBoldIcon(
            name = "Bug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M140 88c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM100 72C91.163 72 84 79.163 84 88c0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16ZM220 144c.003 6.946-.782 13.871-2.34 20.64L236.81 173c6.075 2.656 8.846 9.735 6.19 15.81-2.656 6.075-9.735 8.846-15.81 6.19l-18-7.85c-15.971 30.035-47.212 48.806-81.23 48.806-34.018 0-65.259-18.771-81.23-48.806l-18 7.85c-6.075 2.656-13.154-.115-15.81-6.19-2.656-6.075 .115-13.154 6.19-15.81l19.15-8.36C36.729 157.868 35.971 150.943 36 144v-4h-20C9.373 140 4 134.627 4 128c0-6.627 5.373-12 12-12h20v-4c-.003-6.946 .782-13.871 2.34-20.64L19.19 83C13.115 80.344 10.344 73.265 13 67.19 15.656 61.115 22.735 58.344 28.81 61l18 7.85C62.781 38.815 94.022 20.044 128.04 20.044c34.018 0 65.259 18.771 81.23 48.806l18-7.85c6.075-2.656 13.154 .115 15.81 6.19 2.656 6.075-.115 13.154-6.19 15.81l-19.15 8.36c1.531 6.772 2.289 13.697 2.26 20.64v4h20c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-20ZM60 116h136v-4C196 74.445 165.555 44 128 44 90.445 44 60 74.445 60 112ZM116 210.92v-70.92h-56v4c.047 32.907 23.617 61.073 56 66.92ZM196 144v-4h-56v70.92c32.383-5.847 55.953-34.013 56-66.92Z"),
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
        return _bug!!
    }

private var _bug: ImageVector? = null
