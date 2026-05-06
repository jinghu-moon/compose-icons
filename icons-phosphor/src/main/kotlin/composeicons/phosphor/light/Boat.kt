package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Boat: ImageVector
    get() {
        if (_boat != null) return _boat!!
        _boat = phosphorLightIcon(
            name = "Boat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220.43 112.48 206 107.68v-51.68c0-7.732-6.268-14-14-14h-58v-18c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v18h-58C56.268 42 50 48.268 50 56v51.68l-14.43 4.8c-5.719 1.908-9.574 7.262-9.57 13.29v26.23c0 60 96.44 84.79 100.54 85.82 .958 .24 1.962 .24 2.92 0 17.151-4.629 33.723-11.184 49.4-19.54C212.32 200.15 230 177.24 230 152v-26.23c.004-6.028-3.851-11.382-9.57-13.29ZM62 56c0-1.105 .895-2 2-2h128c1.105 0 2 .895 2 2v47.68L129.9 82.31c-1.233-.412-2.567-.412-3.8 0L62 103.68ZM218 152c0 47.1-78.28 70.54-90 73.79C116.27 222.54 38 199.1 38 152v-26.23c-.001-.862 .551-1.628 1.37-1.9L122 96.32v71.68c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-71.68l82.63 27.55c.819 .272 1.371 1.038 1.37 1.9Z"),
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
        return _boat!!
    }

private var _boat: ImageVector? = null
