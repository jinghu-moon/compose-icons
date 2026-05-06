package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Siren: ImageVector
    get() {
        if (_siren != null) return _siren!!
        _siren = phosphorBoldIcon(
            name = "Siren",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M116 20v-8C116 5.373 121.373 0 128 0c6.627 0 12 5.373 12 12v8c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM200 56c3.184 .003 6.238-1.26 8.49-3.51l8-8c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0l-8 8c-3.453 3.433-4.489 8.612-2.623 13.109 1.866 4.497 6.264 7.421 11.133 7.401ZM47.51 52.49c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17L56.51 27.49c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17ZM236 176v24c0 11.046-8.954 20-20 20h-176C28.954 220 20 211.046 20 200v-24c-.002-9.505 6.687-17.699 16-19.6v-16.4C36 89.19 77.19 48 128 48h.71C179 48.38 220 90.1 220 141v15.4c9.313 1.901 16.002 10.095 16 19.6ZM60 140v16h136v-15C196 103.23 165.73 72.28 128.52 72h-.52C90.445 72 60 102.445 60 140ZM212 180h-168v16h168ZM136.4 113.28c8.735 2.744 15.576 9.585 18.32 18.32 1.988 6.324 8.726 9.838 15.05 7.85 6.324-1.988 9.838-8.726 7.85-15.05-5.098-16.207-17.793-28.902-34-34-6.324-1.988-13.062 1.526-15.05 7.85-1.988 6.324 1.526 13.062 7.85 15.05Z"),
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
        return _siren!!
    }

private var _siren: ImageVector? = null
