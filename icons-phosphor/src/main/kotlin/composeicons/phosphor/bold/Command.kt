package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Command: ImageVector
    get() {
        if (_command != null) return _command!!
        _command = phosphorBoldIcon(
            name = "Command",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 140h-16v-24h16c22.091 0 40-17.909 40-40C220 53.909 202.091 36 180 36c-22.091 0-40 17.909-40 40v16h-24v-16C116 53.909 98.091 36 76 36 53.909 36 36 53.909 36 76c0 22.091 17.909 40 40 40h16v24h-16c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40v-16h24v16c0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40 0-22.091-17.909-40-40-40ZM164 76c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16h-16ZM60 76C60 67.163 67.163 60 76 60c8.837 0 16 7.163 16 16v16h-16C67.163 92 60 84.837 60 76ZM92 180c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16h16ZM116 116h24v24h-24ZM180 196c-8.837 0-16-7.163-16-16v-16h16c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
        return _command!!
    }

private var _command: ImageVector? = null
