package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MessengerLogo: ImageVector
    get() {
        if (_messengerLogo != null) return _messengerLogo!!
        _messengerLogo = phosphorThinIcon(
            name = "MessengerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M178.83 109.17c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83l-32 32c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173L112 117.66 82.83 146.83c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66l32-32c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173L144 138.34l29.17-29.17c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173ZM228 128c.007 35.422-18.726 68.205-49.248 86.182-30.521 17.978-68.275 18.467-99.252 1.288L43.81 227.37c-4.312 1.438-9.067 .316-12.282-2.898-3.214-3.214-4.337-7.969-2.898-12.282L40.53 176.5C20.261 139.92 24.896 94.589 52.149 62.868 79.401 31.146 123.515 19.734 162.732 34.259 201.949 48.784 227.986 86.179 228 128ZM220 128C219.988 89.321 195.785 54.78 159.433 41.564 123.082 28.349 82.346 39.282 57.497 68.923 32.648 98.565 28.993 140.583 48.35 174.07c.573 .992 .694 2.183 .33 3.27L36.22 214.72c-.479 1.437-.105 3.022 .966 4.094 1.071 1.071 2.656 1.446 4.094 .966L78.66 207.32c.409-.139 .838-.21 1.27-.21 .702 .004 1.391 .19 2 .54 28.465 16.468 63.556 16.49 92.042 .057C202.458 191.274 220.006 160.886 220 128Z"),
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
        return _messengerLogo!!
    }

private var _messengerLogo: ImageVector? = null
