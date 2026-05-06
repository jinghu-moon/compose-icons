package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BlueskyLine: ImageVector
    get() {
        if (_blueskyLine != null) return _blueskyLine!!
        _blueskyLine = remixIcon(
            name = "BlueskyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.907 3.439c.709 .121 1.533 .502 2.576 1.248C9.28 5.971 10.769 7.739 12 9.564 13.231 7.739 14.72 5.971 16.517 4.687c1.043-.745 1.867-1.127 2.576-1.248 .768-.131 1.29 .064 1.616 .2C21.717 4.06 22 5.225 22 6.215c0 .202-.086 1.302-.185 2.36-.051 .546-.109 1.108-.166 1.576-.052 .429-.115 .881-.19 1.133-.343 1.155-1.062 1.977-1.951 2.517 .937 .707 1.277 1.856 .928 2.984-.597 1.924-2.737 4.398-4.835 4.618C13.828 21.59 12.666 20.079 12 18.645c-.666 1.434-1.828 2.945-3.6 2.759C6.301 21.183 4.161 18.71 3.564 16.786c-.35-1.127-.009-2.276 .928-2.984C3.603 13.262 2.884 12.439 2.541 11.285c-.075-.253-.138-.704-.19-1.133C2.294 9.683 2.237 9.121 2.185 8.575 2.086 7.517 2 6.416 2 6.215 2 5.225 2.283 4.06 3.292 3.639c.326-.136 .848-.331 1.615-.2ZM4.049 6.917c.064 .818 .18 2.108 .288 2.992 .033 .267 .055 .544 .122 .806 .398 1.34 1.929 2.082 3.686 1.887 .542-.06 1.032 .325 1.102 .865 .07 .541-.306 1.038-.845 1.118-.756 .112-3.315 .356-2.928 1.607 .357 1.151 1.848 3.086 3.134 3.221 .928 .097 1.5-1.394 1.766-2.045 .275-.674 .488-1.379 .668-1.981 .126-.424 .516-.714 .958-.714 .442 0 .832 .29 .958 .714 .18 .602 .393 1.307 .668 1.981 .266 .651 .838 2.142 1.766 2.045 1.286-.135 2.777-2.07 3.134-3.221 .388-1.251-2.172-1.495-2.928-1.607-.539-.08-.915-.577-.845-1.118 .07-.541 .56-.925 1.102-.865 1.757 .195 3.289-.547 3.686-1.887 .069-.266 .089-.536 .122-.806 .108-.884 .223-2.175 .288-2.992 .037-.468 .248-1.637-.522-1.506-.286 .049-.823 .241-1.749 .903-1.943 1.389-3.705 3.513-4.789 5.64-.171 .335-.515 .546-.891 .546-.376 0-.72-.211-.891-.546C10.025 9.827 8.263 7.703 6.32 6.314 5.394 5.652 4.857 5.46 4.571 5.411 3.787 5.277 4.012 6.445 4.049 6.917Z"),
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
        return _blueskyLine!!
    }

private var _blueskyLine: ImageVector? = null
