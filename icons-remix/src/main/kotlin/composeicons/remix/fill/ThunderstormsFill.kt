package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ThunderstormsFill: ImageVector
    get() {
        if (_thunderstormsFill != null) return _thunderstormsFill!!
        _thunderstormsFill = remixIcon(
            name = "ThunderstormsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.989 18l1.216-1.581c.202-.262 .311-.584 .311-.915 0-.828-.671-1.5-1.5-1.5h-2.015v-3.976c0-.466-.217-.905-.586-1.189-.657-.505-1.598-.382-2.103 .275L5.945 17.396C3.042 16.196 1 13.337 1 10 1 5.582 4.582 2 9 2c3.395 0 6.296 2.115 7.458 5.099C16.795 7.034 17.144 7 17.5 7 20.538 7 23 9.462 23 12.5 23 15.538 20.538 18 17.5 18h-.511ZM13 16.005h3l-5 6.5v-4.5h-3l5-6.505v4.505Z"),
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
        return _thunderstormsFill!!
    }

private var _thunderstormsFill: ImageVector? = null
