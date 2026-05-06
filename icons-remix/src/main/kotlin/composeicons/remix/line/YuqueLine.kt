package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.YuqueLine: ImageVector
    get() {
        if (_yuqueLine != null) return _yuqueLine!!
        _yuqueLine = remixIcon(
            name = "YuqueLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.505 3.043c.164-.284 .467-.459 .795-.459 1.547 0 3.09 .049 4.637 .153 2.509 .172 3.701 1.591 4.18 2.431 .596 .092 1.389 .088 1.571 .806 .141 .552-.217 .833-.554 1.148-.483 .451-1.132 1.176-.954 1.888 .056 .222 .159 .437 .316 .765l.002 .003c.319 .667 .684 1.51 .742 3.115 .156 4.341-3.596 6.896-7.252 7.079C12.577 21.788 8.643 22.998 2.431 21.93c-.395-.068-.758-.335-.945-.708-.103-.207-.16-.46-.12-.736 .039-.275 .166-.511 .331-.699C4.924 16.111 8.331 12.54 11.35 8.688c.526-.671 .961-1.28 1.151-1.648 .308-.919-.01-1.444-.626-2.463-.282-.467-.689-.978-.369-1.534ZM13.494 8.886c.874 .005 1.851 .248 2.885 .875 2.124 1.288 2.335 3.996 1.625 6.157-.164 .5-.432 1.098-.836 1.726 1.936-.796 3.319-2.484 3.24-4.686-.046-1.28-.316-1.872-.563-2.389-.01-.02-.019-.04-.029-.061-.133-.276-.311-.646-.413-1.053-.271-1.08 .175-2.039 .614-2.677-.18-.112-.319-.285-.387-.493 0 0 0 .001-.001-.001-.012-.031-.179-.431-.578-.817-.408-.393-1.095-.823-2.237-.901-.963-.065-1.925-.108-2.89-.13 .452 .879 .758 1.941 .289 3.268-.151 .426-.459 .819-.718 1.183ZM12.662 10.831c-.719 .202-1.214 .63-1.378 .815C8.567 14.703 5.403 18.335 3.708 20.273c5.45 .748 8.602-.49 10.378-1.921 1.296-1.043 1.925-2.24 2.177-3.005 .434-1.323 .537-3.187-.834-4.017-1.153-.699-2.088-.69-2.767-.498Z"),
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
        return _yuqueLine!!
    }

private var _yuqueLine: ImageVector? = null
