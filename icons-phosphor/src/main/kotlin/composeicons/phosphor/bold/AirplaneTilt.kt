package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AirplaneTilt: ImageVector
    get() {
        if (_airplaneTilt != null) return _airplaneTilt!!
        _airplaneTilt = phosphorBoldIcon(
            name = "AirplaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M190 115.31 217.21 89.7l.26-.26c13.864-14.091 13.772-36.726-.206-50.704C203.286 24.758 180.651 24.666 166.56 38.53c-.09 .08-.17 .17-.26 .26L140.69 66 60.1 36.71c-4.379-1.591-9.284-.503-12.58 2.79l-24 24c-2.554 2.541-3.831 6.096-3.479 9.682 .353 3.586 2.298 6.823 5.299 8.818l59.83 39.88L75 132h-19c-3.18 0-6.23 1.263-8.48 3.51l-24 24c-2.85 2.848-4.081 6.937-3.276 10.886 .805 3.948 3.538 7.229 7.276 8.734l35.23 14.1 14.06 35.14 .09 .22c1.552 3.747 4.892 6.456 8.878 7.202 3.986 .746 8.08-.571 10.882-3.502l23.81-23.81c2.255-2.247 3.525-5.297 3.53-8.48v-19l10.13-10.13L174 230.65c1.994 2.992 5.224 4.931 8.802 5.286 3.578 .354 7.126-.914 9.668-3.456l24-24c3.297-3.298 4.385-8.208 2.79-12.59ZM185.89 205.16 146 145.33c-1.995-2.989-5.224-4.926-8.8-5.28-.399-.037-.799-.054-1.2-.05-3.185 0-6.239 1.266-8.49 3.52l-24 24c-2.247 2.25-3.51 5.3-3.51 8.48v19l-7.62 7.62L83.14 179.52c-1.22-3.052-3.638-5.47-6.69-6.69L53.35 163.59 61 156h19c3.18-0 6.23-1.263 8.48-3.51l24-24c2.551-2.541 3.825-6.093 3.473-9.676-.353-3.583-2.296-6.818-5.293-8.814L50.84 70.12l8.24-8.25 80.83 29.39c4.505 1.639 9.553 .44 12.84-3.05L183.64 55.39c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17l-32.82 30.89c-3.494 3.284-4.697 8.333-3.06 12.84l29.4 80.82Z"),
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
        return _airplaneTilt!!
    }

private var _airplaneTilt: ImageVector? = null
