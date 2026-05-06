package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Question: ImageVector
    get() {
        if (_question != null) return _question!!
        _question = phosphorBoldIcon(
            name = "Question",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 180c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM236 128c0 59.647-48.353 108-108 108C68.353 236 20 187.647 20 128 20 68.353 68.353 20 128 20c59.619 .066 107.934 48.381 108 108ZM212 128C212 81.608 174.392 44 128 44 81.608 44 44 81.608 44 128c0 46.392 37.608 84 84 84 46.371-.05 83.95-37.629 84-84ZM128 64C103.74 64 84 81.94 84 104v4c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4c0-8.82 9-16 20-16 11 0 20 7.18 20 16 0 8.82-9 16-20 16-6.627 0-12 5.373-12 12v8c-.015 6.14 4.608 11.301 10.713 11.96 6.105 .659 11.722-3.398 13.017-9.4C158.31 137.88 172 122.37 172 104 172 81.94 152.26 64 128 64Z"),
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
        return _question!!
    }

private var _question: ImageVector? = null
