package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileVideo: ImageVector
    get() {
        if (_fileVideo != null) return _fileVideo!!
        _fileVideo = phosphorDuotoneIcon(
            name = "FileVideo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 88h-56v-56ZM120 160c0-4.418-3.582-8-8-8h-64c-4.418 0-8 3.582-8 8v48c0 4.418 3.582 8 8 8h64c4.418 0 8-3.582 8-8v-12l32 20v-64l-32 20Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M213.66 82.34l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v72c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-72h88v48c0 4.418 3.582 8 8 8h48v120h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8c8.837 0 16-7.163 16-16v-128c.002-2.122-.84-4.158-2.34-5.66ZM160 51.31 188.69 80h-28.69ZM155.88 145c-2.545-1.408-5.655-1.324-8.12 .22l-19.95 12.46C126.66 149.831 119.933 144.01 112 144h-64c-8.837 0-16 7.163-16 16v48c0 8.837 7.163 16 16 16h64c7.933-.01 14.66-5.831 15.81-13.68l19.95 12.46c2.466 1.541 5.573 1.623 8.116 .214 2.543-1.409 4.122-4.087 4.124-6.994v-64c.001-2.909-1.576-5.589-4.12-7ZM112 208h-64v-48h64v48ZM144 201.57l-16-10v-15.14l16-10Z"),
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
        return _fileVideo!!
    }

private var _fileVideo: ImageVector? = null
